package home

import com.adeo.kviewmodel.BaseSharedViewModel
import home.models.HomeAction
import home.models.HomeEvent
import home.models.HomeViewState

class HomeViewModel : BaseSharedViewModel<HomeViewState, HomeAction, HomeEvent>(
  initialState = HomeViewState(
    username = "John Doe",
    avatarUrl = "https://i.pravatar.cc/150?img=1",
  )
) {
  override fun obtainEvent(viewEvent: HomeEvent) {
    when(viewEvent) {
      HomeEvent.UserProfileClicked -> showUserProfile()
    }
  }

  private fun showUserProfile() {
    viewAction = HomeAction.ShowUserProfile
  }
}