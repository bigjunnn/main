package seedu.address.logic.commands.recipe;

import static java.util.Objects.requireNonNull;
import static seedu.address.model.Model.PREDICATE_SHOW_ALL_RECIPES;

import seedu.address.logic.commands.CommandResult;
import seedu.address.logic.commands.ListCommand;
import seedu.address.model.Model;

/**
 * Lists all recipes in the Duke Cooks to the user.
 */
public class ListRecipeCommand extends ListCommand {

    public static final String VARIANT_WORD = "recipe";

    public static final String MESSAGE_SUCCESS = "Listed all recipes";


    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);
        model.updateFilteredRecipeList(PREDICATE_SHOW_ALL_RECIPES);
        return new CommandResult(MESSAGE_SUCCESS);
    }
}