package com.lezenford.lesson4.composite;

public interface Operation {
    // выполнить одиночную или композитную операцию
    void perform();

    // браузер структуры
    String getExplanation();
}
