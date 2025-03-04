package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GitHubPage {
    private final SelenideElement
            solutionsButton = $(byTagAndText("button", "Solutions")),
            enterpriseButton = $(byText("Enterprise")),
            headerTitle = $("#hero-section-brand-heading");

    public GitHubPage openPage() {
        open("/");
        return this;
    }

    public GitHubPage hoverSolutions() {
        solutionsButton.hover();
        return this;
    }

    public GitHubPage clickEnterprise() {
        enterpriseButton.click();
        return this;
    }

    public GitHubPage checkTitle() {
        headerTitle.shouldHave(text("Build and ship software on a single, collaborative platform"));
        return this;
    }
}
