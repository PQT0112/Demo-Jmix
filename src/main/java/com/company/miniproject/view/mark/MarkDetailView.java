package com.company.miniproject.view.mark;

import com.company.miniproject.entity.Mark;
import com.company.miniproject.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "marks/:id", layout = MainView.class)
@ViewController(id = "Mark.detail")
@ViewDescriptor(path = "mark-detail-view.xml")
@EditedEntityContainer("markDc")
@DialogMode(width = "64em")
public class MarkDetailView extends StandardDetailView<Mark> {
}