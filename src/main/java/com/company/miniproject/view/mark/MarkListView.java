package com.company.miniproject.view.mark;

import com.company.miniproject.entity.Mark;
import com.company.miniproject.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "marks", layout = MainView.class)
@ViewController(id = "Mark.list")
@ViewDescriptor(path = "mark-list-view.xml")
@LookupComponent("marksDataGrid")
@DialogMode(width = "64em")
public class MarkListView extends StandardListView<Mark> {
}