package com.company.miniproject.view.university;

import com.company.miniproject.entity.University;
import com.company.miniproject.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "universities/:id", layout = MainView.class)
@ViewController(id = "University.detail")
@ViewDescriptor(path = "university-detail-view.xml")
@EditedEntityContainer("universityDc")
public class UniversityDetailView extends StandardDetailView<University> {
}