//
//  LoginScreen.swift
//  iosApp
//
//  Created by Dmitry Seloustev on 31.12.2022.
//  Copyright © 2022 orgName. All rights reserved.
//

import SwiftUI
import SharedSDK

struct LoginScreen: View {
    private let loginViewModel = LoginViewModel()

    var body: some View {
        ObservingView(statePublisher: statePublisher(loginViewModel.viewStates())) { viewState in
            LoginView(viewState: viewState) { event in
                loginViewModel.obtainEvent(viewEvent: event)
            }
        }
    }
}
