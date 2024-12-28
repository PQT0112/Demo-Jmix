package com.company.miniproject.view.teacher;

import com.company.miniproject.entity.Teacher;
import com.company.miniproject.view.main.MainView;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.data.renderer.Renderer;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.StreamResource;
import io.jmix.core.FileRef;
import io.jmix.core.FileStorage;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;





@Route(value = "teachers", layout = MainView.class)
@ViewController(id = "Teacher.list")
@ViewDescriptor(path = "teacher-list-view.xml")
@LookupComponent("teachersDataGrid")
@DialogMode(width = "64em")
public class TeacherListView extends StandardListView<Teacher> {
    @ViewComponent
    private DataGrid<Teacher> teachersDataGrid;

    @Autowired
    private UiComponents uiComponents;

    @Autowired
    private FileStorage fileStorage;

    @Supply(to = "teachersDataGrid.picture", subject = "renderer")
    private Renderer<Teacher> teachersDataGridPictureRenderer() {
        return new ComponentRenderer<>(user -> {
            FileRef fileRef = user.getPicture();
            if (fileRef != null) {
                Image image = uiComponents.create(Image.class);
                image.setWidth("30px");
                image.setHeight("30px");
                StreamResource streamResource = new StreamResource(
                        fileRef.getFileName(),
                        () -> fileStorage.openStream(fileRef));
                image.setSrc(streamResource);
                image.setClassName("user-picture");

                return image;
            } else {
                return null;
            }
        });
    }
}