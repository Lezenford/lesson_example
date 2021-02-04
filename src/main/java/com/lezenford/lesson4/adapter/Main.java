package com.lezenford.lesson4.adapter;

public class Main {
    public static void main(String[] args) {
        final RestApi api = new RestApi();

        Item item = new Item();
        item.setInfo("test item");

        api.sendRequest(item);

        Member member = new Member();
        member.setName("test member");

        MemberAdapter memberAdapter = new MemberAdapter(member);
        api.sendRequest(memberAdapter);
    }
}
