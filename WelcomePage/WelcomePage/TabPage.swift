//
//  TabPage.swift
//  WelcomePage
//
//  Created by 坂井俊文 on 2026/04/12.
//

import SwiftUI

let gradientColors: [Color] = [
    .gradientTop,
    .gradientBottom,
]

struct TabPage: View {
    var body: some View {
        TabView {
            ContentView()
            FeaturesPage()
        }
        .background(Gradient(colors: gradientColors))
        .tabViewStyle(.page)
        .foregroundStyle(.white)
    }
}


#Preview {
    TabPage()
}
