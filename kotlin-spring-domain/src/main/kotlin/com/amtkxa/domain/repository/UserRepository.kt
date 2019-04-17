package com.amtkxa.domain.repository

import com.amtkxa.domain.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

interface UserRepository : JpaRepository<User, Long>, JpaSpecificationExecutor<User>
