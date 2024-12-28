package com.company.miniproject.view.university;

import com.company.miniproject.entity.University;
import com.company.miniproject.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "universities", layout = MainView.class)
@ViewController(id = "University.list")
@ViewDescriptor(path = "university-list-view.xml")
@LookupComponent("universitiesDataGrid")
@DialogMode(width = "64em")
public class UniversityListView extends StandardListView<University> {
}