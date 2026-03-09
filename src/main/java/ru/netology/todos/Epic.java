package ru.netology.todos;

public class Epic extends Task {
    protected String[] subtusk;

    public Epic(int id, String[] subtusk) {
        super(id);
        this.subtusk = subtusk;
    }

    public String[] getSubtusk() {
        return subtusk;
    }

    @Override
    public boolean matches(String query) {
        for (String subtusk : subtusk) {
            if (subtusk.contains(query)) {
                return true;
            }
        }
        return false;
    }
}

