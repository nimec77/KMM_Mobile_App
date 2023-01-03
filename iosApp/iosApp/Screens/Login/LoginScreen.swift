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
    @State private var isForgotPasswordScreenPresented: Bool = false
    @State private var isRegistrationScreenPresented: Bool = false
    @State private var isMainScreenPresented: Bool = false
    private let loginViewModel = LoginViewModel()

    var body: some View {
        ObservingView(statePublisher: statePublisher(loginViewModel.viewStates())) { viewState in
            LoginView(viewState: viewState) { event in
                loginViewModel.obtainEvent(viewEvent: event)
            }
        }
                .sheet(isPresented: $isRegistrationScreenPresented, content: { RegistrationScreen() })
                .sheet(isPresented: $isForgotPasswordScreenPresented, content: { ForgotScreen() })
                .fullScreenCover(isPresented: $isMainScreenPresented, content: { MainView() })
                .onReceive(sharePublisher(loginViewModel.viewActions())) { action in
                    switch (action) {
                    case LoginAction.OpenForgotPasswordScreen():
                        isForgotPasswordScreenPresented = true
                    case LoginAction.OpenRegistrationScreen():
                        isRegistrationScreenPresented = true
                    case LoginAction.OpenMainFlow():
                        isMainScreenPresented = true

                    default:
                        break
                    }
                }
    }
}
