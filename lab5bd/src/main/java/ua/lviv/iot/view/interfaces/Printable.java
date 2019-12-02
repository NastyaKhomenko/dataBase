package ua.lviv.iot.view.interfaces;

import java.sql.SQLException;
@FunctionalInterface
public interface Printable {
    void print() throws SQLException;
}