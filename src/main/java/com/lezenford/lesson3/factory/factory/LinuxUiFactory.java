package com.lezenford.lesson3.factory.factory;

import com.lezenford.lesson3.factory.ui.Button;
import com.lezenford.lesson3.factory.ui.Select;
import com.lezenford.lesson3.factory.ui.TextField;
import com.lezenford.lesson3.factory.ui.nix.LinuxButton;
import com.lezenford.lesson3.factory.ui.nix.LinuxSelect;
import com.lezenford.lesson3.factory.ui.nix.LinuxTextField;

public class LinuxUiFactory implements AbstractUiFactory {
    @Override
    public Button getButton() {
        System.out.println("create Linux button");
        return new LinuxButton();
    }

    @Override
    public Select getSelect() {
        System.out.println("create Linux select");
        return new LinuxSelect();
    }

    @Override
    public TextField getTextField() {
        System.out.println("create Linux textField");
        return new LinuxTextField();
    }
}
