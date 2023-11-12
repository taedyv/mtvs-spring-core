package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.Account;
import com.ohgiraffers.common.Member;
import com.ohgiraffers.common.PersonalAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean
    public Account accountGenerator() {

        return new PersonalAccount("111-222-333333", 1000);
    }

    @Bean
    public Member memberGenerator() {

//        return new Member(1,
//                "홍길동",
//                "010-1234-5678",
//                "hong123@gmail.com",
//                accountGenerator());

        Member member = new Member();
        member.setSequence(1);
        member.setName("홍길동");
        member.setPhone("010-1234-5678");
        member.setEmail("hong123@gmail.com");
        member.setPersonalAccount(accountGenerator());

        return member;
    }
}
