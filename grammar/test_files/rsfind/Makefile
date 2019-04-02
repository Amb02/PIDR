SRC = app/rsfind.c app/option.c app/error.c app/find.c app/exec.c app/regex.c app/regex_shell.c app/long_listing.c app/long_listing_stats.c
INC = app/option.h app/defines.h app/includes.h app/error.h app/find.h app/regex.h app/exec.h app/regex_shell.h app/long_listing.h app/long_listing_stats.h

OBJ = $(SRC:.c=.o)
BIN = rsfind

CFLAGS = -std=gnu99 -Wall -Werror -Wextra -Wformat
LDFLAGS = -lm -ldl -lpcre

.PHONY: all clean

all: $(BIN)

$(OBJ): $(INC)
$(BIN): $(OBJ)
	$(CC) $^ $(CFLAGS) $(LDFLAGS) $(TARGET_ARCH) -o $@
	rm -f $(OBJ)

delo:
	rm -f $(OBJ)

clean:
	rm -f $(OBJ)
	rm -f $(BIN)

test:	rsfind test.sh
	bash test.sh
