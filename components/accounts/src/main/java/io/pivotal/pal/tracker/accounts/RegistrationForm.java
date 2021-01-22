package io.pivotal.pal.tracker.accounts;

import java.util.Objects;

public class RegistrationForm {

  public final String name;

  public RegistrationForm(String name) {
    this.name = name;
  }

  private RegistrationForm() {
    this(null);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    RegistrationForm that = (RegistrationForm) o;

    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return name != null ? name.hashCode() : 0;
  }

  @Override
  public String toString() {
    return "RegistrationForm{" + "name='" + name + '\'' + '}';
  }
}
