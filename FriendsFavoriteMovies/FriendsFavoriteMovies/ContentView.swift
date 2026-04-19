//
//  ContentView.swift
//  FriendsFavoriteMovies
//
//  Created by 坂井俊文 on 2026/04/18.
//

import SwiftUI
import SwiftData

struct ContentView: View {
    var body: some View {
        VStack {
            TabView {
                Tab("Friends", systemImage: "Person.and.person") {
                    FriendList()
                }
                
                Tab("Movies", systemImage: "film.stack") {
                    FilteredMovieList()
                }
            }
        }
    }
}

#Preview {
    ContentView()
        .modelContainer(SampleData.shared.modelContainer)
}
