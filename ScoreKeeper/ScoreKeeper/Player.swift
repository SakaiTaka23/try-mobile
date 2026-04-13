//
//  Player.swift
//  ScoreKeeper
//
//  Created by 坂井俊文 on 2026/04/13.
//

import Foundation

struct Player: Identifiable {
    let id = UUID()
    
    var name: String
    var score: Int
}
