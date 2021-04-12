package utils.controls.implementations;

import utils.controls.interfaces.MenuItemExecutable;

public class ExitMenuItem implements MenuItemExecutable {

  public ExitMenuItem() {
  }

  public void execute() {
    System.exit(0);
  }

  public String getDisplayName() {
    return "Выйти";
  }

}
