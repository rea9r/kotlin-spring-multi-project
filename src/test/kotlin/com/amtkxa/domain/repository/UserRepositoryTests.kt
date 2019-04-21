package com.amtkxa.domain.repository

import com.amtkxa.domain.entity.User
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager
import org.springframework.test.context.jdbc.Sql
import org.springframework.test.context.junit4.SpringRunner
import java.time.LocalDateTime

@RunWith(SpringRunner::class)
@DataJpaTest
class UserRepositoryTests {
    @Autowired
    lateinit var entityManager: TestEntityManager

    @Autowired
    lateinit var sut: UserRepository

    @Test
    @Sql(statements = ["INSERT INTO user (userId, name, updated) VALUES (1, 'test', CURRENT_TIMESTAMP)"])
    fun findById() {
        val expected = entityManager.find(User::class.java, 1L)
        val actual = sut.findById(expected.userId).orElseGet { null }
        assertThat(actual).isNotNull()
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun save() {
        val updated = LocalDateTime.of(2019, 4, 15, 21, 39, 0)
        val expected = User(name = "testuser", updated = updated)
        sut.saveAndFlush(expected)
        val actual = entityManager.find(User::class.java, expected.userId)
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    @Sql(statements = ["INSERT INTO user (userId, name, updated) VALUES (1, 'test', CURRENT_TIMESTAMP)"])
    fun delete() {
        val expected = entityManager.find(User::class.java, 1L)
        sut.deleteById(expected.userId)
        sut.flush()
        val actual = entityManager.find(User::class.java, expected.userId)
        assertThat(actual).isNull()
    }
}