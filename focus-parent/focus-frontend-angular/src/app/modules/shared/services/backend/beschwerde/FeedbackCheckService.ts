import { inject, Injectable } from "@angular/core";
import { FeedbackGrund } from "../../../models/feedback/feedback-grund.model";
import { FeedbackLang } from "../../../models/feedback/feedback-lang.model";
import { FeedbackArt } from "../../../models/feedback/feedbackart.model";
import { AlertService } from "../../frontend/alert/alert.service";

@Injectable({
    providedIn: "root",
})
export class FeedbackCheckService {
    private alertService = inject(AlertService);

    private gruende: FeedbackGrund[];

    checkConstraints(
        feedback: FeedbackLang,
        showErrorMessages: boolean,
    ): boolean {
        let complete = true;

        if (
            feedback.feedbackArt == FeedbackArt.getById(0).id &&
            !feedback.verbesserung?.trim()
        ) {
            complete = false;
            if (showErrorMessages) {
                this.alertService.info(
                    "Verbesserungspotential muss ausgefüllt sein, bei Anregungen",
                );
            }
        }

        if (feedback.themaId == null) {
            complete = false;
            if (showErrorMessages) {
                this.alertService.info("Thema muss ausgewählt sein.");
            }
        }

        if (feedback.grundId == null) {
            complete = false;
            if (showErrorMessages) {
                this.alertService.info("Grund muss ausgewählt sein.");
            }
        }

        return complete;
    }
}
