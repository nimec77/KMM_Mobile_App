import SwiftUI

struct ContentView: View {

    var body: some View {
        LoginScreen()
				.background(Color.backgroundPrimary)
                .background(ignoresSafeAreaEdges: [.all])
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
