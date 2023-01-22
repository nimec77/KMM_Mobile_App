//
// Created by Dmitry Seloustev on 22.01.2023.
// Copyright (c) 2023 orgName. All rights reserved.
//

import SwiftUI
import SharedSDK

struct SearchView: View {

    let viewState: SearchViewState
    let eventHandler: (SearchEvent) -> Void

    var body: some View {
        ZStack {
            VStack {
                Spacer().frame(height: 26)
                CommonTextField(hint: "SearchGame") { newValue in
                    eventHandler(SearchEvent.QueryChanged(query: newValue))
                }
                Spacer().frame(height: 16)
                ScrollView {
                    VStack {
                        ForEach(viewState.games, id: \.gameId) { game in
                            VStack(alignment:.leading) {
                                Text(game.name)
                                        .foregroundColor(.textPrimary)
                                        .padding(EdgeInsets(top: 8, leading: 16, bottom: 8, trailing: 16))
                            }
                        }
                    }
                }
            }
        }
                .frame(maxWidth: .infinity, maxHeight: .infinity)
                .background(Color.backgroundPrimary)
    }
}
