package adv.kiraly.hml.worker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import adv.kiraly.hml.worker.model.WorkerModel;

@RestController
@RequestMapping("/worker")
public class WorkerController {
    @GetMapping("/new")
    public WorkerModel newWorker() {
        return new WorkerModel("Worker from Worker Service");
    }
}
