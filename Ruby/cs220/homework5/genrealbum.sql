SELECT
	a.album_name,
	ar.genre
FROM
	album a,
	artist ar
WHERE
	a.artist_name = ar.artist_name
;
