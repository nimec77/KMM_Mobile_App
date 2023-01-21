//
//  HomeScreen.swift
//  iosApp
//
//  Created by Dmitry Seloustev on 03.01.2023.
//  Copyright © 2023 orgName. All rights reserved.
//

import SwiftUI
import SharedSDK

struct HomeScreen: View {
    private let viewModel = HomeViewModel()
    @State private var isProfilePresented = false

    var body: some View {
        ObservingView(statePublisher: statePublisher(viewModel.viewStates())) { viewState in
            HomeView(viewState: viewState) { event in
                viewModel.obtainEvent(viewEvent: event)
            }
        }
    }
}

struct HomeScreen_Previews: PreviewProvider {
    static var previews: some View {
        HomeScreen()
    }
}
