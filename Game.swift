//
//  Game.swift
//  ObjectsProj1
//
//  Created by Mario Luja on 11/12/22.
//

import Foundation

class Game
{
    var title:String;
    var platform:String;
    var genre:String;
    var publisher:String;
    var rating:Double;
    var requirements:SystemRequirements;
    var client_info:Client;
    
    init(title: String, platform: String, genre: String, publisher: String, rating: Double, requirements: SystemRequirements, client_info: Client) {
        self.title = title
        self.platform = platform
        self.genre = genre
        self.publisher = publisher
        self.rating = rating
        self.requirements = requirements
        self.client_info = client_info
    }
}
