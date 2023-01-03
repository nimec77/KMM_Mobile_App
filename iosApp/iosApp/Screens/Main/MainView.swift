//
//  MainView.swift
//  iosApp
//
//  Created by Dmitry Seloustev on 03.01.2023.
//  Copyright © 2023 orgName. All rights reserved.
//

import SwiftUI

struct MainView: View {
    var body: some View {
        TabView {
            HomeScreen()
                .tabItem{
                    Label("Home", systemImage: "house")
                }
            
            SearchScreen()
                .tabItem {
                    Label("Search", systemImage: "magnifyingglass")
                }

            EventsScreen()
                .tabItem {
                    Label("Events", systemImage: "calendar")
                }

            VideosScreen()
                .tabItem {
                    Label("Videos", systemImage: "play.rectangle")
                }
        }
    }
}

struct MainView_Previews: PreviewProvider {
    static var previews: some View {
        MainView()
    }
}
