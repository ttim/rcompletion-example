package tuple;

import java.util.List;

/**
 * Class must contains empty constructor!
 */
public interface ISuggestable {
    /**
     *
     * @return Suggestions. Return % at cursor position
     */
    public List<String> getSuggestions();
}
