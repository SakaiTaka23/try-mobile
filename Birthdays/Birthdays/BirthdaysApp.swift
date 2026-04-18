//
//  BirthdaysApp.swift
//  Birthdays
//
//  Created by 坂井俊文 on 2026/04/16.
//

import SwiftUI
import SwiftData

@main
struct BirthdaysApp: App {
    var body: some Scene {
        WindowGroup {
            ContentView()
                .modelContainer(for: Friend.self)
        }
    }
}
