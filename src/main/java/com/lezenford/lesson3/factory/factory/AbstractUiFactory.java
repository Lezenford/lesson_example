package com.lezenford.lesson3.factory.factory;

import com.lezenford.lesson3.factory.ui.Button;
import com.lezenford.lesson3.factory.ui.Select;
import com.lezenford.lesson3.factory.ui.TextField;

public interface AbstractUiFactory {
    Button getButton();

    Select getSelect();

    TextField getTextField();
}
