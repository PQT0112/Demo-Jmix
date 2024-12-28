package com.company.miniproject.view.lophoc;

import com.company.miniproject.entity.LopHoc;
import com.company.miniproject.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "lopHocs/:id", layout = MainView.class)
@ViewController(id = "LopHoc.detail")
@ViewDescriptor(path = "lop-hoc-detail-view.xml")
@EditedEntityContainer("lopHocDc")
public class LopHocDetailView extends StandardDetailView<LopHoc> {

}