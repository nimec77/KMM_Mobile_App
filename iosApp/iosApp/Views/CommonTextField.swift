//
//  CommonTextField.swift
//  iosApp
//
//  Created by Dmitry Seloustev on 24.12.2022.
//  Copyright © 2022 orgName. All rights reserved.
//

import SwiftUI

struct CommonTextField: View {

    @State private var value: String = ""
    private let hint: String
    private let enabled: Bool
    private let isSecure: Bool
    private var isPasswordHidden: Bool
    private let onValueChanged: (String) -> Void
    private let onPasswordHiddenClicked: () -> Void

    init(hint: String, enabled: Bool = true, isSecure: Bool = false, isPasswordHidden: Bool = true,
         onPasswordHiddenClicked: @escaping () -> Void = {},
         onValueChanged: @escaping (String) -> Void) {
        self.hint = hint
        self.enabled = enabled
        self.isSecure = isSecure
        self.isPasswordHidden = isPasswordHidden
        self.onPasswordHiddenClicked = onPasswordHiddenClicked
        self.onValueChanged = onValueChanged
    }

    var body: some View {
        ZStack(alignment: .leading) {
            RoundedRectangle(cornerRadius: 10)
                    .foregroundColor(.backgroundSecondary)

            if (value.isEmpty) {
                Text(hint)
                        .foregroundColor(.textPrimary.opacity(0.5))
                        .padding(EdgeInsets(top: 0, leading: 20, bottom: 0, trailing: 20))
                        .font(.system(size: 16))
            }

            if (isSecure) {
                if (isPasswordHidden) {
                    HStack {
                        SecureField("", text: $value)
                                .foregroundColor(.textPrimary)
                                .font(.system(size: 16))
                                .autocapitalization(.none)
                                .disableAutocorrection(true)
                                .disabled(!enabled)
                                .padding(EdgeInsets(top: 0, leading: 20, bottom: 0, trailing: 20))
                                .onChange(of: value) { newValue in
                                    onValueChanged(newValue)
                                }
                        Button {
                            onPasswordHiddenClicked()
                        } label: {
                            Image(systemName: "eye")
                        }
                                .foregroundColor(.textPrimary.opacity(0.5))
                                .padding(EdgeInsets(top: 0, leading: 0, bottom: 0, trailing: 20))
                    }
                } else {
                    HStack {
                        TextField("", text: $value)
                                .foregroundColor(.textPrimary)
                                .font(.system(size: 16))
                                .autocapitalization(.none)
                                .disableAutocorrection(true)
                                .disabled(!enabled)
                                .padding(EdgeInsets(top: 0, leading: 20, bottom: 0, trailing: 20))
                                .onChange(of: value) { newValue in
                                    onValueChanged(newValue)
                                }
                        Button {
                            onPasswordHiddenClicked()
                        } label: {
                            Image(systemName: "eye.slash")
                        }
                                .foregroundColor(.textPrimary.opacity(0.5))
                                .padding(EdgeInsets(top: 0, leading: 0, bottom: 0, trailing: 20))
                    }
                }

            } else {
                TextField("", text: $value)
                        .foregroundColor(.textPrimary)
                        .font(.system(size: 16))
                        .autocapitalization(.none)
                        .disableAutocorrection(true)
                        .disabled(!enabled)
                        .padding(EdgeInsets(top: 0, leading: 20, bottom: 0, trailing: 20))
                        .onChange(of: value) { newValue in
                            onValueChanged(newValue)
                        }
            }
        }
                .frame(height: 56)
                .padding(EdgeInsets(top: 0, leading: 24, bottom: 0, trailing: 24))
    }

}

struct CommonTextField_Previews: PreviewProvider {
    static var previews: some View {
        CommonTextField(hint: "Your Email", enabled: true, isSecure: true,
                onValueChanged: { newValue in
                    print(newValue)
                })
    }
}
