package com.fant.bean;

public class Brand {

    private String name;

    private NoteBookComputer noteBook;

    private DesktopComputer desktop;

    public Brand() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NoteBookComputer getNoteBook() {
        return noteBook;
    }

    public void setNoteBook(NoteBookComputer noteBook) {
        this.noteBook = noteBook;
    }

    public DesktopComputer getDesktop() {
        return desktop;
    }

    public void setDesktop(DesktopComputer desktop) {
        this.desktop = desktop;
    }
}
