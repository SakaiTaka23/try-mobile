//
//  ContentView.swift
//  WelcomePage
//
//  Created by 坂井俊文 on 2026/04/12.
//

import SwiftUI

struct ContentView: View {
    var body: some View {
        VStack {
            ZStack {
                RoundedRectangle(cornerRadius: 30)
                    .frame(width: 150, height: 150)
                    .foregroundStyle(.tint)
                Image(systemName: "figure.2.and.child.holdinghands")
                    .font(.system(size: 70))
                    .foregroundStyle(.white)
            }
            Text("Welcome to My App")
                .font(Font.title)
                .fontWeight(Font.Weight.semibold)
                .padding(.top)
            
            Text("Description text")
                .font(.title2) // Can ommit Font
        }
        .padding()
    }
}

#Preview {
    ContentView()
}
