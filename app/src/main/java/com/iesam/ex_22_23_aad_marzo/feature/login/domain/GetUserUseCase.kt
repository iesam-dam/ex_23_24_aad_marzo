package com.iesam.ex_22_23_aad_marzo.feature.login.domain

class GetUserUseCase(private val userRepository: UserRepository) {

    fun invoke(): User {
        return userRepository.getUser()
    }
}