package dukecooks.ui;

import dukecooks.model.diary.components.Page;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.text.Text;

import java.io.File;

/**
 * An UI component that displays information of a {@code Diary}.
 */
public class PageCard extends UiPart<Region> {

    private static final String FXML = "PageListCard.fxml";

    /**
     * Note: Certain keywords such as "location" and "resources" are reserved keywords in JavaFX.
     * As a consequence, UI elements' variable names cannot be set to such keywords
     * or an exception will be thrown by JavaFX during runtime.
     *
     * @see <a href="https://github.com/se-edu/addressbook-level4/issues/336">The issue on AddressBook level 4</a>
     */

    public final Page page;

    @FXML
    private HBox cardPane;

    @FXML
    private Label pageTitle;

    @FXML
    private ImageView pageImage;

    @FXML
    private Text pageDescription;


    public PageCard(Page page, int displayedIndex) {
        super(FXML);
        this.page = page;
        pageTitle.setText(displayedIndex + ". " + page.getTitle().toString());

        // Handle the description and image method here
    }

    @Override
    public boolean equals(Object other) {
        // short circuit if same object
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof PageCard)) {
            return false;
        }

        // state check
        PageCard card = (PageCard) other;
        return pageTitle.getText().equals(card.pageTitle.getText())
                && page.equals(card.page);
    }
}
