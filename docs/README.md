# Conan bot

![Manage your task as smart as Conan](https://www.nicepng.com/png/full/689-6894004_topic-screen-la-fin-de-dtective-conan.png)

## Feature
&#10004; Fields in *[square bracket]* are parameters supplied by the user.

&#10004; Fields in *[date]* are in format of `yyyy-mm-dd`.

| Command                                  | Description                                                      |
|------------------------------------------|------------------------------------------------------------------|
| `list`                                   | List all tasks                                                   |
| `todo [text]`                            | Add a todo task                                                  |
| `deadline [text] /by [date]`       | Add a deadline task                                              |
| `event [text] /at [date]`          | Add a event task                                                 |
| `mark [number]`                          | Mark a task as done, replace number by its index in the list     |
| `unmark [number]`                        | Mark a task as not done, replace number by its index in the list |
| `delete [number]`                        | Delete a task, replace number by its index in the list           |
| `find [keyword]`                         | Find tasks that have the description matching the keyword        |
| `bye`                                    | Exit chat bot                                                    |

### Flexible search!
- The search is case-insensitive and matches partial words.
- The `find` command will show all task that match at least 3 characters of your keyword, i.e. finding CON will return conan.

## Saving data
Task data is saved internally in a file `List.txt` in a folder `data` in the app’s directory only upon exit.
So closing the window mid-execution will discard all changes.
The task data is loaded from the internal storage when starting the app.

## Sample view
![](https://april-anh.github.io/ip/Ui.png)

### Acknowledgement
This project is inspired by the Duke bot from [this repo](https://github.com/nus-cs2103-AY2223S1/ip).

