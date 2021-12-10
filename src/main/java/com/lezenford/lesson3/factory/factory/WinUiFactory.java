package com.lezenford.lesson3.factory.factory;

import com.lezenford.lesson3.factory.ui.Button;
import com.lezenford.lesson3.factory.ui.Select;
import com.lezenford.lesson3.factory.ui.TextField;
import com.lezenford.lesson3.factory.ui.win.WinButton;
import com.lezenford.lesson3.factory.ui.win.WinSelect;
import com.lezenford.lesson3.factory.ui.win.WinTextField;

public class WinUiFactory implements AbstractUiFactory {
    @Override
    public Button getButton() {
        System.out.println("create Win button");
        return new WinButton();
    }

    @Override
    public Select getSelect() {
        System.out.println("create Win select");
        return new WinSelect();
    }

    @Override
    public TextField getTextField() {
        System.out.println("create Win textField");
        return new WinTextField();
    }
}
