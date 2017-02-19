SELECT
        avg(length)
FROM
        mp3 m,
        artist ar,
        album a
WHERE
        a.album_name = m.album_title
        AND
        a.artist_name = ar.artist_name
	AND
	ar.genre = 'Rock'
;
