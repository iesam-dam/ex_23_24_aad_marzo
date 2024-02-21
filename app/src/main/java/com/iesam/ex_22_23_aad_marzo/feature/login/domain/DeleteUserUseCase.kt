package com.iesam.ex_22_23_aad_marzo.feature.login.domain

class DeleteUserUseCase(private val userRepository: UserRepository) {

    fun invoke(): Boolean {
        userRepository.deleteUser()
        return true
    }
}