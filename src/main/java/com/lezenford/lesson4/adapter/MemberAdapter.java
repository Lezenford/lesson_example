package com.lezenford.lesson4.adapter;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MemberAdapter implements RestApiMember{
    private final Member member;

    @Override
    public String getData() {
        return member.getName();
    }
}
