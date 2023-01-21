//
// Created by Dmitry Seloustev on 21.01.2023.
// Copyright (c) 2023 orgName. All rights reserved.
//

import SwiftUI
import SharedSDK

struct HomeView: View {
    let viewState: HomeViewState
    let eventHandler: (HomeEvent) -> Void

    var body: some View {
        ZStack {
            VStack {
                Spacer().frame(height: 16)

                HStack {
                    Spacer().frame(width: 16)

                    AsyncImage(url: URL(string: viewState.avatarUrl), content: { image in
                        image
                                .resizable()
                                .aspectRatio(contentMode: .fill)
                                .frame(width: 56, height: 56)
                    }, placeholder: {
                        ProgressView()
                    })
                            .clipShape(Circle())
                            .frame(width: 56, height: 56)
                }
            }
        }
                .frame(maxWidth: .infinity, maxHeight: .infinity)
                .background(Color.backgroundPrimary)
    }
}
