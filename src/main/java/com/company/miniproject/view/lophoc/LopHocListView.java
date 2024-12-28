package com.company.miniproject.view.lophoc;

import com.company.miniproject.entity.LopHoc;
import com.company.miniproject.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "lopHocs", layout = MainView.class)
@ViewController(id = "LopHoc.list")
@ViewDescriptor(path = "lop-hoc-list-view.xml")
@LookupComponent("lopHocsDataGrid")
@DialogMode(width = "64em")
public class LopHocListView extends StandardListView<LopHoc> {
}