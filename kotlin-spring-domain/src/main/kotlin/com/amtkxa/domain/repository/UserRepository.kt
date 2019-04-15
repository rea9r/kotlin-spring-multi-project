package com.amtkxa.domain.repository

import com.amtkxa.domain.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long>