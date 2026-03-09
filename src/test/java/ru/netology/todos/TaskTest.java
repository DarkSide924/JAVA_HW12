package ru.netology.todos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
    @Test
    public void testSimpleTaskMatchesSucces () {
        SimpleTask task = new SimpleTask(1, "Сделать домашку");
        Assertions.assertTrue(task.matches("домашку"));
    }
    @Test
    public void testSimpleTaskMatchesFailed () {
        SimpleTask task = new SimpleTask(1, "Сделать домашку");
        Assertions.assertFalse(task.matches("хлеб"));
    }

    @Test
    public void testEpicMatchesSucces () {
        String[] subtasks = {"Купить молоко", "Погулять с собакой", "Сделать домашнее задание"};
        Epic epic = new Epic(22, subtasks);
        Assertions.assertTrue(epic.matches("молоко"));
    }

    @Test
    public void testEpicMatchesFailed() {
        String[] subtasks = {"Купить молоко", "Погулять с собакой", "Сделать домашнее задание"};
        Epic epic = new Epic(22, subtasks);
        Assertions.assertFalse(epic.matches("вода"));
    }

    @Test
    public void testMeetingMatchesSuccesTopic() {
        Meeting meeting = new Meeting(1, "Обсуждение проекта", "Финансовый отчёт", "10:00");
        Assertions.assertTrue(meeting.matches("проекта"));
    }

    @Test
    public void testMeetingMatchesSuccesProject() {
        Meeting meeting = new Meeting(2, "Планерка команды", "Разработка мобильного приложения", "14:00");
        Assertions.assertTrue(meeting.matches("приложения"));
    }

    @Test
    public void testMeetingMatchesFailed() {
        Meeting meeting = new Meeting(3, "Созвон с клиентом", "Анализ рынка", "16:30");
        Assertions.assertFalse(meeting.matches("отчёт"));
    }


}