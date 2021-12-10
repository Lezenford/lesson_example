package com.lezenford.lesson3.factory;

import com.lezenford.lesson3.factory.factory.AbstractUiFactory;
import com.lezenford.lesson3.factory.factory.LinuxUiFactory;
import com.lezenford.lesson3.factory.factory.MacUiFactory;
import com.lezenford.lesson3.factory.factory.WinUiFactory;
import com.lezenford.lesson3.factory.ui.Button;
import com.lezenford.lesson3.factory.ui.Select;
import com.lezenford.lesson3.factory.ui.TextField;

public class Main {
    public static void main(String[] args) {
        System.out.println("Create Win UI:");
        createUi(createFactory(OperationSystem.WIN));
        System.out.println("------------------");
        System.out.println("Create Mac UI:");
        createUi(createFactory(OperationSystem.MAC));
        System.out.println("------------------");
        System.out.println("Create Linux UI:");
        createUi(createFactory(OperationSystem.LINUX));
    }

    private static AbstractUiFactory createFactory(OperationSystem operationSystem) {
        switch (operationSystem) {
            case MAC:
                return new MacUiFactory();
            case WIN:
                return new WinUiFactory();
            case LINUX:
                return new LinuxUiFactory();
            default:
                throw new IllegalArgumentException("Unsupported operation system");
        }
    }

    private static void createUi(AbstractUiFactory factory) {
        final Button button = factory.getButton();
        final Select select = factory.getSelect();
        final TextField textField = factory.getTextField();
    }

    private enum OperationSystem {
        WIN, MAC, LINUX
    }
}
