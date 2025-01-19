import { FactsComponent } from "./components/facts/facts.component";
import { NgModule } from "@angular/core";
import { AppComponent } from "./app.component";

@NgModule({
    imports: [
        FactsComponent
    ],
    declarations: [
      AppComponent
    ],
    bootstrap: [AppComponent]
  })

export class AppModule {
}