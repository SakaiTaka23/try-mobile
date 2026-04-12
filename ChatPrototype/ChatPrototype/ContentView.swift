//
//  ContentView.swift
//  ChatPrototype
//
//  Created by 坂井俊文 on 2026/04/12.
//

import SwiftUI

struct ContentView: View {
    var body: some View {
        VStack {
            Image(systemName: "globe")
                .imageScale(.large)
                .foregroundStyle(.tint)
            Text("Knock, knock!")
                .padding()
                .background(Color.yellow, in: RoundedRectangle(cornerRadius: 8))
            Text("Who's there?")
        }
        .padding()
    }
}

#Preview {
    ContentView()
}
