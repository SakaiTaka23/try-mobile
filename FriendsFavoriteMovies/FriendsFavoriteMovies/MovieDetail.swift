//
//  MovieDetail.swift
//  FriendsFavoriteMovies
//
//  Created by 坂井俊文 on 2026/04/18.
//

import SwiftUI
import SwiftData

struct MovieDetail: View {
    @Bindable var movie: Movie
    let isNew: Bool


    @Environment(\.dismiss) private var dismiss
    @Environment(\.modelContext) private var context


    init(movie: Movie, isNew: Bool = false) {
        self.movie = movie
        self.isNew = isNew
    }
    
    var sortedFriends: [Friend] {
        movie.favoriteBy.sorted { first, second in
            first.name < second.name
        }
    }


    var body: some View {
        Form {
            TextField("Movie title", text: $movie.title)


            DatePicker("Release date", selection: $movie.releaseDate, displayedComponents: .date)
            
            if !movie.favoriteBy.isEmpty {
                Section("Favorited by") {
                    ForEach(sortedFriends) { friend in
                        Text(friend.name)
                    }
                }
            }
        }
        .navigationTitle(isNew ? "New Movie" : "Movie")
        .navigationBarTitleDisplayMode(.inline)
        .toolbar {
            if isNew {
                ToolbarItem(placement: .confirmationAction) {
                    Button("Save") {
                        dismiss()
                    }
                }
                ToolbarItem(placement: .cancellationAction) {
                    Button("Cancel") {
                        context.delete(movie)
                        dismiss()
                    }
                }
            }
        }
    }
}


#Preview {
    NavigationStack {
        MovieDetail(movie: SampleData.shared.movie)
    }
}
