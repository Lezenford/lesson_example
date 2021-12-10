package com.lezenford.lesson3.factory.factory;

import com.lezenford.lesson3.factory.ui.Button;
import com.lezenford.lesson3.factory.ui.Select;
import com.lezenford.lesson3.factory.ui.TextField;
import com.lezenford.lesson3.factory.ui.mac.MacButton;
import com.lezenford.lesson3.factory.ui.mac.MacSelect;
import com.lezenford.lesson3.factory.ui.mac.MacTextField;

public class MacUiFactory implements AbstractUiFactory {
    @Override
    public Button getButton() {
        System.out.println("create Mac button");
        return new MacButton();
    }

    @Override
    public Select getSelect() {
        System.out.println("create Mac select");
        return new MacSelect();
    }

    @Override
    public TextField getTextField() {
        System.out.println("create Mac textField");
        return new MacTextField();
    }
}
