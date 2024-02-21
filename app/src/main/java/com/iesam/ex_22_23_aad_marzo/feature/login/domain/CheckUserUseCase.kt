package com.iesam.ex_22_23_aad_marzo.feature.login.domain

class CheckUserUseCase(
    private val userRepository: UserRepository,
) {

    fun invoke(user: User): Boolean {
        val userLogged = userRepository.getUser()
        if (userLogged == null) {
            userRepository.saveUser(user)
        } else {
            println(userLogged.toString())
        }
        return true
    }
}